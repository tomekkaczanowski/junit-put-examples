package com.practicalunittesting.chp06.asynch;

import com.jayway.awaitility.Awaitility;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class ServerTest {

	@Test
	public void shouldSaveTasks() throws InterruptedException {
		TaskService taskService = mock(TaskService.class);
		ExecutorService executorService = Executors.newCachedThreadPool();
		Task task = mock(Task.class);
		Collection<Task> listOfTasks = Arrays.asList(task);
		Server server = new Server(executorService, taskService);

		server.serve(listOfTasks);

		//Thread.sleep(1000);

		verify(taskService).handle(task);
	}

	@Test
	public void shouldSaveTasks3() {
		TaskService taskService = mock(TaskService.class);
		ExecutorService executorService = new SynchronousExecutorService();
		Server server = new Server(executorService, taskService);

		Task task = mock(Task.class);
		Collection<Task> listOfTasks = Arrays.asList(task);
		server.serve(listOfTasks);

		verify(taskService).handle(task);
	}

	static int counter = 1;

	@Test
	public void awaitilityTest() {
		Awaitility.await().pollInterval(100, MILLISECONDS).atMost(1, SECONDS).until(new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				System.out.println("trying " + counter++);

				return false;
			}
		});
	}

	@Test
	public void awaitilityTest2() {

		Awaitility.await().pollInterval(100, MILLISECONDS).atMost(1, SECONDS).until(new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				System.out.println("trying " + counter++);
				try {
					throw new RuntimeException();
				} catch (Exception e) {
					return false;
				}
			}
		});
	}

	@Test
	public void awaitilityTest3() {
		final ArrayList list = mock(ArrayList.class);

		Awaitility.await().pollInterval(100, MILLISECONDS).atMost(1, SECONDS).until(new Callable<Boolean>() {

			@Override
			public Boolean call() throws Exception {
				System.out.println("trying " + counter++);
				try {
					verify(list).clear();
					return true;
				} catch (AssertionError ae) {
					return false;
				}
			}
		});
	}

	@Test
	public void shouldSaveTasksUsingTryCatch() throws InterruptedException {
		final TaskService taskService = mock(TaskService.class);
		ExecutorService executorService = Executors.newCachedThreadPool();
		final Task task = mock(Task.class);
		Collection<Task> listOfTasks = Arrays.asList(task);
		Server server = new Server(executorService, taskService);

		server.serve(listOfTasks);

		boolean handleMethodInvoked = false;
		for (int i = 0; i < 10; i++) {
			try {
				verify(taskService).handle(task);
				handleMethodInvoked = true;
			} catch (AssertionError e) {
				// no need to do anything
			}
			Thread.sleep(200);
		}
		assertTrue(handleMethodInvoked);
	}


	@Test
	public void shouldSaveTasksUsingAwaitility() {
		final TaskService taskService = mock(TaskService.class);
		ExecutorService executorService = Executors.newCachedThreadPool();
		final Task task = mock(Task.class);
		Collection<Task> listOfTasks = Arrays.asList(task);
		Server server = new Server(executorService, taskService);

		server.serve(listOfTasks);

		Awaitility.await()
				.atMost(1, SECONDS)
				.with().pollInterval(200, MILLISECONDS)
				.until(new Callable<Boolean>() {

					@Override
					public Boolean call() throws Exception {
						try {
							verify(taskService).handle(task);
							return true;
						} catch (AssertionError ae) {
							return false;
						}
					}
				});
	}
}
