package model;

public class DiningTable {
    int t_id;
    int status;

    public DiningTable(int t_id, int status) {
        this.t_id = t_id;
        this.status = status;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
