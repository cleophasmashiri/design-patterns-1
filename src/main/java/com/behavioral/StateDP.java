public class StateDP {

    public static void main(String[] args) {
        String s = "State is behavioral design pattern that lets an object change its behavior when its state changes";
        System.out.printf("%s%n", s);
    }

   
}

 enum EnumState {
        DRAFT,
        MODERATION,
        PUBLISHED
    }

    // original 
    class Document {
        private EnumState state;
        public void publish() {
            switch (state) {
                case DRAFT:
                    state = EnumState.MODERATION;
                    break;
                case MODERATION:
                    state = EnumState.PUBLISHED;
                    break;
                case PUBLISHED:
                    // do nothing
                    break;
            }
        }
    }

    class DocumentWithState {
        public State state;
        public State render() {
            state.render();
        }
        public State publish() {
            state.publish();
        }
        public void changeState(State state) {
            this.state = state;
        }
    }

    interface State {
        public abstract State render();
        public abstract State publish();
    }

    class Draft implements State {
        @Override
        public State render() {
           
        }
        @Override
        public State publish() {
           
        }
    }