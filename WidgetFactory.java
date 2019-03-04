
public abstract  class WidgetFactory {
	public Window preparandoCreaterScroll(String tipo){
		Window wind=null;
		wind= createWindowns(tipo);
		return wind;
	}
	
	public ScrollBar preparandoCreaterWin(String tipo){
		ScrollBar s=null;
		s= createScrollBar(tipo);
		return s;
	}
	
	public abstract Window createWindowns(String type);
	public abstract ScrollBar createScrollBar(String type);


	
	
	
	
	
	
	

}
