class RegisterCourse extends Thread {
    Object courseName;
    Object trainerName;

    public RegisterCourse(Object courseName, Object trainerName) {
        this.courseName = courseName;
        this.trainerName = trainerName;
    }

    public void run() {
        synchronized (courseName) {
            System.out.println("RegisterCourse thread holds courseName resource and waiting for trainerName");

            synchronized (trainerName) {
                System.out.println(
                        "RegisterCourse thread holds both courseName and trainerName, so that, course registration is success");
            }
        }
    }
}

class CancelCourse extends Thread {
    Object courseName;
    Object trainerName;

    public CancelCourse(Object courseName, Object trainerName) {
        this.courseName = courseName;
        this.trainerName = trainerName;
    }

    public void run() {
        synchronized (trainerName) {
            System.out.println("CancelCourse thread holds trainerName resource and waiting for courseName resource");
            synchronized (courseName) {
                System.out.println(
                        "CancelCourse thread holds both courseName and trainerName, so that, course cancellation is success");
            }
        }
    }
}

// watch the lecture

public class Runner {
    public static void main(String[] args) {
        Object courseName = new Object();
        Object trainerName = new Object();

        RegisterCourse rc = new RegisterCourse(courseName, trainerName);
        CancelCourse cc = new CancelCourse(courseName, trainerName);

        rc.start();
        cc.start();
    }
}
