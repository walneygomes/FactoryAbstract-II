
public class WindownsWidgetFactory extends WidgetFactory{

	@Override
	public Window createWindowns(String type) {
		
		Window wn=null;
		if(type.equals("WindownsWindow")){
			wn= new WindownsWindow();
		}
		else if( type.equals("NotifWindow")){
			wn= new NotifWindow();
			
		}
 		return wn;
	}

	@Override
	public ScrollBar createScrollBar(String type) {
		ScrollBar sb=null;
		if(type.equals("MobitScrollBar")){
			sb= new MobitScrollBar();
		}
		else if( type.equals("windownsScrollBar")){
			sb= new windownsScrollBar();
			
		}
    return sb;
		
		
		
	}
	

}
