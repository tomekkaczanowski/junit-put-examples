package com.practicalunittesting.chp06.asynch;

import java.util.Collection;
import java.util.concurrent.ExecutorService;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Server {

	private final ExecutorService executorService;
	private final TaskService taskService;

	public Server(ExecutorService executorService, TaskService taskService) {
		this.executorService = executorService;
		this.taskService = taskService;
	}

	public void serve(Collection<Task> tasks) {
		for (Task task : tasks) {
			executorService.submit(new TaskHandler(taskService, task));
		}
	}

	private class TaskHandler implements Runnable {
		private final TaskService taskService;
		private final Task task;

		public TaskHandler(TaskService taskService, Task task) {
			this.taskService = taskService;
			this.task = task;
		}

		public void run() {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			taskService.handle(task);
		}
	}
}
