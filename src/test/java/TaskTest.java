import com.csci5308.ConsoleApplication.Member;
import com.csci5308.ConsoleApplication.Task;
import com.csci5308.ConsoleApplication.TaskOverdueException;
import com.csci5308.ConsoleApplication.TaskStatus;
import org.junit.Assert;
import org.junit.Test;


public class TaskTest {


    @Test
    public void checkTaskAssignedToMember() {
        Member member = new Member("John Doe", 1);

        Task task = new Task("Task 1", System.currentTimeMillis() + 15 * 60 * 1000);

        Assert.assertEquals(member, task.assignTo(member));

    }


    @Test(expected = IllegalArgumentException.class)
    public void checkTaskAssignedToMemberIsNull() {
        Task task = new Task("Task 1", null, TaskStatus.inProgress, System.currentTimeMillis() + 15 * 60 * 1000);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTaskStatusIsNull() {
        Task task = new Task("Task 1", System.currentTimeMillis() + 15 * 60 * 1000);

        task.updateStatus(null);

    }


    @Test
    public void checkStatusUpdated() {
        Task task = new Task("Task 1", System.currentTimeMillis() + 15 * 60 * 1000);
        Assert.assertEquals(TaskStatus.completed, task.updateStatus(TaskStatus.completed));
    }


    @Test
    public void checkStatusUpdatedToOpenState() {
        Task task = new Task("Task 1", TaskStatus.open, System.currentTimeMillis() + 15 * 60 * 1000);
        Assert.assertEquals(TaskStatus.open, task.updateStatus(TaskStatus.open));
    }

    @Test
    public void checkStatusUpdatedToClosedState() {
        Task task = new Task("Task 1", TaskStatus.completed, System.currentTimeMillis() + 15 * 60 * 1000);
        Assert.assertEquals(TaskStatus.completed, task.updateStatus(TaskStatus.completed));
    }


    @Test(expected = TaskOverdueException.class)
    public void checkIfTaskOverdue() {
        Task task = new Task("Task 1", System.currentTimeMillis() - 15 * 60 * 1000);
        task.isOverdue();
    }

    @Test
    public void checkIfTaskIsNotOverdue() {

        Task task = new Task("Task 1", System.currentTimeMillis() + (15 * 60 * 1000));

        task.isOverdue();
    }


}
