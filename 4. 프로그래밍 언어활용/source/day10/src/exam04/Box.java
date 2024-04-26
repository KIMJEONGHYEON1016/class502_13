package exam04;

public class Box {
    private Object item;   //new Apple() 객체 <<

    public Object getItem() {
        return item;           // new Apple() 객체를 반환함.
    }

    public void setItem(Object item) {   //item -> new Apple()객체로
        this.item = item;
    }
}
