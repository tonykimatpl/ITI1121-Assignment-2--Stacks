public class TowersofHanoi{
	private Stack<Integer>[] rods;
	
	public TowersofHanoi(int n){
		rods = new ArrayStack[3];
		rods[0] = new ArrayStack<Integer>(n);
		rods[1] = new ArrayStack<Integer>(n);
		rods[2] = new ArrayStack<Integer>(n);
		for(int i=n; i>0; i--){
			rods[0].push(i);
		}
	}
	public boolean legalMove(int a, int b){
		if(){	
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean move(int a, int b){
		if(legalMove){
			
		}
		else{
			return false;
		}
	}
	
	public boolean move(int m, int a, int b, int c){
		
	}
	
	public void showTowerStates(){
		
	}
	
	public void solvegame(){
		
	}
}