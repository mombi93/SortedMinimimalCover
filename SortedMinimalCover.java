public class SortedMinimalCover {	
	
	private void SortFunction(int TimeArray[][]){
		int Earliest[] = DetermineEarliest(TimeArray,TimeArray[0]);
		int Latest[] = DetermineLatest(TimeArray,TimeArray[1]);
		System.out.print("Start: ");
		DisplayTime(Earliest);
		System.out.print("End: ");
		DisplayTime(Latest);
	}
	
	private void DisplayTime(int Time[]){
		System.out.println(Time[0] + "/" + Time[1] + "/" + Time[2]);
	}
	
	private int [] DetermineEarliest(int TimeArray[][], int Earliest[]){
		// determine the earliest
		for (int i = 0; i < TimeArray.length; i+=2){
			for (int j = 0; j < Earliest.length; j++){
				if (TimeArray[i][j] < Earliest [j]){
					if (TimeArray[i][j] < Earliest [j]){
						if (TimeArray[i][j] < Earliest [j]){
							Earliest = TimeArray[i];
						}
					}
				}
			}
		}
		return Earliest;
	}
	
	private int [] DetermineLatest(int TimeArray[][], int Latest[]){
		for (int i = 1; i < TimeArray.length; i+=2){
			for (int j = 0; j < Latest.length; j++){
				if (TimeArray[i][j] > Latest[j]){
					if (TimeArray[i][j] > Latest[j]){
						if (TimeArray[i][j] > Latest[j]){
							Latest = TimeArray[i];
						}
					}
				}
			}
		}
		return Latest;
	}
	
	public void start(){
		int TimeArray[][] = {{23,05,2004},{05,12,2005},{12,01,2003},{8,9,2013},{21,12,1999},{8,9,2012}};
		SortFunction(TimeArray);
	}
	
	public static void main(String[] args){	
		new SortedMinimalCover().start();
	}
}
