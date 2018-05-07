public class OzzzTask implements Runnable {
    final int id;
    public OzzzTask(int id) { this.id = id; }
    @Override
    public void run() {
        new Ozzz(0.1); // Seconds
        System.out.println(this + " " +
                Thread.currentThread().getName());
    }
    @Override
    public String toString() {
        return "NapTask[" + id + "]";
    }
}