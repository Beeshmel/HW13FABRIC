package src.Template;

public abstract class Education {
    public void learn(){
        enter();
        study();
        passExams();
        getDocument();
    }

    protected abstract void getDocument();
    protected abstract void study();

    private void passExams() {
        System.out.println("Сдача экзаменов");
    }

    protected abstract void enter();
}
