package oops_part_2.encapsulation.realPrinter;

public class Printer {
	private int pagesPrint;
	private double tonerLevel;
	private boolean isDuplex;

    private Printer(double tonerLevel,boolean isDuplex,int pagesPrint) {
		this.tonerLevel = tonerLevel;
		this.isDuplex = isDuplex;
		this.pagesPrint = pagesPrint;
	}
	
	public Printer(boolean isDuplex) {
		this(100,isDuplex,0);	
	}
	
	public void reFill(double fill) {
		System.out.println("Order: fill by " + fill+"%");
		if(this.tonerLevel==100)
			System.out.println("***Toner is Already full***");
		else
		{
			double extra = fill-(100.0-this.tonerLevel);
			extra = Math.round(extra*100.0)/100.0;
			
			if(extra>0)
			   System.out.println("--> We are returning your "+ extra + "% ink");
			
		    fill=Math.round(fill*10.0)/10.0;
		    this.tonerLevel+=Math.min(fill, 100-this.tonerLevel);
		    System.out.println("--> Toner is Refilled to " + getTonerLevel()+"\n");
		}
	}

	public int getPagesPrint() {
		return pagesPrint;
	}

	public String getTonerLevel() {
		this.tonerLevel = Math.round(this.tonerLevel*10.0)/10.0;
		return tonerLevel+"%";
	}
	
	public void print(int pages) {
		System.out.println("Order: Print " + pages + ( (pages==1)? " page":" pages"));
		if(this.tonerLevel>=(double)pages/10)
		{
			if(this.isDuplex)
				this.pagesPrint+=(pages/2)+(pages%2);
			else
				this.pagesPrint+=pages;
		    decreaseTonerLevel(pages);
		}
		else if(this.tonerLevel==0)
		{
			System.out.println("--> Toner Exhausted, Please Refill the Toner!!!");
		}
		else
		{
			int canPrint = (int)(this.tonerLevel*10);
			if(this.isDuplex)
				this.pagesPrint+=(canPrint/2)+(canPrint%2);
			else
				this.pagesPrint+=canPrint;
			decreaseTonerLevel(pages);
			
			System.out.println("Only " +  canPrint +  " pages can be Printed, Refill the toner!!!");
		}
		System.out.println("--> Pages Printed so Far:" +getPagesPrint());
		System.out.println("--> Remaining Toner Level:" + getTonerLevel()+"\n");
	}
	
	private void decreaseTonerLevel(int pages)
	{
		this.tonerLevel-=(double)pages/10;
		this.tonerLevel = Math.round(this.tonerLevel*10.0)/10.0;
		if(this.tonerLevel<0)
		this.tonerLevel = 0;
	}
	
	}
