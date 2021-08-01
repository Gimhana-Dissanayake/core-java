public class Runner {
    // NOTE: Java Bean is a normal java class, it will include variables and the
    // repective setXXX() and getXXX() methods, setXXX() methods are used to set
    // data to the vairables and getXXX() methods can be used to get data from the
    // variables

    public static void main(String[] args) {
        Student std = new Student();
        std.setSid("S-111");
        System.out.println(std.getSid());
    }

}

class Student {
    private String sid;
    private String sname;
    private String addr;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

}