package csci132.Lab5.src.main.java.org.csci.labs;

/**
 * @author : Adiesha
 * @created : 7/21/2022, Thursday
 **/
public class Browser {

    // add the stacks needed
    Stack<String> back;
    Stack<String> forward;

    public String currentPage;

    public Browser() {
        back = new LinkedStack<>();
        forward = new LinkedStack<>();
    }

    public Browser(String initialPage) {
        this();
        this.currentPage = initialPage;
    }


    public String back() {
        if (back.isEmpty() || back.size() == 1){
            return null;
        }
        forward.push(currentPage);
        currentPage = back.pop();
        return currentPage;
    }

    public String forward() {
        if (forward.isEmpty()){
            return null;
        }
        back.push(currentPage);
        currentPage = forward.pop();
        return currentPage;
    }

    public String visit(String page) {
        while (!forward.isEmpty()){
            forward.pop();
        }
        back.push(currentPage);
        currentPage = page;
        return currentPage;
        }

    public String checkPreviousWebPage() {
        return back.top();
    }

    public String checkNextWebPage() {
        return forward.top();
    }

}
