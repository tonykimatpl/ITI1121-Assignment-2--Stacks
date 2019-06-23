public class TowersofHanoi{
	private Stack<Integer>[] rods;
	private int n;

	public TowersofHanoi(int n){
		rods = new ArrayStack[3];
		rods[0] = new ArrayStack<Integer>(n);
		rods[1] = new ArrayStack<Integer>(n);
		rods[2] = new ArrayStack<Integer>(n);
		this.n = n;
    for(int i=n; i>0; i--){
			rods[0].push(i);
		}
	}
	public boolean legalMove(int a, int b){
		if(rods[a].peek() < rods[b].peek()){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean move(int a, int b){
		if(legalMove(a, b)){
      int discNum = rods[a].pop();
			rods[b].push(discNum);
      System.out.println("disc "+discNum+" moved from rod "+a+" to rod "+b);
		}
		else{
			return false;
		}
		return true;
	}

	public boolean move(int m, int a, int b, int c){
		if(m == 1){
      move(a,b);
    }
    else{
      move(m-1,a,c,b);
      move(a,b);
      move(m-1,c,b,a);
    }
		return true;
	}

	public void showTowerStates(){
    Stack[] tempRods = new ArrayStack[3];
    tempRods = this.rods.clone();
    String firstTow = "First tower = ";
    String secondTow = "Second tower = ";
    String thirdTow = "Third tower = ";

		while(tempRods[0].peek()!=null){
      firstTow += rods[0].pop()+", ";
    }
    while(tempRods[1].peek()!=null){
      secondTow += rods[1].pop()+", ";
    }
    while(tempRods[2].peek()!=null){
      thirdTow += rods[2].pop()+", ";
    }
    System.out.println(firstTow);
    System.out.println(secondTow);
    System.out.println(thirdTow);
	}

	public void solvegame(){
		move(this.n,0,2,1);
	}
}
