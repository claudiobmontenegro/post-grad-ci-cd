public class Valores implements ValoresITF {
	int array[] = new int[10];
	
	public boolean ins(int v) {
		if (v <= 0) {
			return false;
		}
		for (int a = 0; a < array.length; a++) {
			if (array[a] == 0) {
					array[a] = v;
					return true;
			}
		}
		return false;
	}
	
	public int del(int i) {
		int aux = 0;
		boolean flag = false;
		// verificando se o array esta sem elementos
		for (int a = 0; a < array.length; a++) {
			if (array[i] != 0) { 
				flag = true;
			}
		}
		if (flag) {
			if (i >= 0 && i <= 9) {
				aux = array[i];	
				array[i] = 0;
			}
			return aux;
		}else {
			return -1;
		}
	}	
	
	public int size(){
		int cont = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				cont= cont +1;
			}
		}
		return cont;
	}
}