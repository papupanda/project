class Mobile 
{
	private long mno;
	private String mobilename;
	private double price;
	private String color;
	Mobile(long mno,String mobilename){
	this.mno=mno;
	this.mobilename=mobilename;
}
	public long getMno(){
		return mno;
	}
	public String getMobilename(){
		return mobilename;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public double price(){
		return price;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void display(){
		System.out.println("\tmno :"+mno);
		System.out.println("\tmobilename :"+mobilename);
		System.out.println("\tprice :"+price);
		System.out.println("\tcolor :"+color);
		System.out.println("Hello");
		System.out.println("Bye");



	}
}
