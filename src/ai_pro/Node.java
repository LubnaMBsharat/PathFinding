/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_pro;

/**
 *
 * @author englu_2ecwi4v
 */
public class Node {
        private int cellType = 0;

        private double h=-1;
        private double f=-1;
        private int cost=0;
        
	private int x;
	private int y;
	private int parentX;
	private int parentY;
	private double dToEnd = 0;
        
        
        public Node(int type, int x, int y) 
        {	
		cellType = type;
		this.x = x;
		this.y = y;
                parentX=-1;
                parentY=-1;
                f=5000;
	}
       
        public int getX() 
        {
            return x;
        }		
	public int getY() 
        {
            return y;
        }
	public int getparentX() 
        {
            return parentX;
        }
	public int getparentY() 
        {
            return parentY;
        }
	public int getType() 
        {
            return cellType;
        }
		
	public void setType(int type) 
        {
            cellType = type;
        }		
	public void setLastNode(int x, int y) 
        {
            parentX = x; parentY = y;
        }


    public double getH() {
        return h;
    }

    public int getCost() {
        return cost;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

   public void setParentX(int parentX) {
        this.parentX = parentX;
    }

    public void setParentY(int parentY) {
        this.parentY = parentY;
    }

    public int getParentX() {
        return parentX;
    }

    public int getParentY() {
        return parentY;
    }
      
    
         
        public double getEuclidDist() 
        {		
		int xdif = Math.abs(x/*-finishx*/);
		int ydif = Math.abs(y/*-finishy*/);
		dToEnd = Math.sqrt((xdif*xdif)+(ydif*ydif));
		return dToEnd;
	}
}


