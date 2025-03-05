import com.csci5308.ConsoleApplication.Member;
import com.csci5308.ConsoleApplication.Task;
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

    @Test
    public void checkTaskAssignedToMemberIsNull() {
        Member member = new Member("John Doe", 1);

        Task task = new Task("Task 1", System.currentTimeMillis() + 15 * 60 * 1000);

        Assert.assertEquals(member, task.assignTo(member));

    }



    @Test
    public void checkStatusUpdated() {
        Task task = new Task("Task 1", System.currentTimeMillis() + 15 * 60 * 1000);
        Assert.assertEquals(TaskStatus.open, task.updateStatus(TaskStatus.completed));
    }


    @Test
    public void checkIfTaskOverdue() {

        Task task = new Task("Task 1", System.currentTimeMillis() + 15 * 60 * 1000);

        Assert.assertTrue(task.isOverdue());
    }

    @Test
    public void checkIfTaskIsNotOverdue() {

        Task task = new Task("Task 1", System.currentTimeMillis() + 15 * 60 * 1000);

        Assert.assertFalse(task.isOverdue());
    }


}
