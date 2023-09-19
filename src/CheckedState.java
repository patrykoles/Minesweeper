public class CheckedState implements State{
    private Field field;
    CheckedState(Field field){
        this.field = field;
    }
    @Override
    public void leftClick() {

    }

    @Override
    public void rightClick() {
        field.changeState(new DefaultState(field));
    }
}
