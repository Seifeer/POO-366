public class exemplo2 {
	public static void main(String[] args) {
		int horas, minutos, segundos;
		for(horas=0; horas<24;horas++) {
			for (minutos=0; minutos<60; minutos++) {
				for (segundos=0; segundos<60; segundos++) {
					System.out.println(horas+ "h:"+minutos+"min:"+segundos+"s");
					try {
						Thread.sleep(100);
						if (horas==12) {
							System.exit(0);
						}
					}catch (InterruptedException erro) {
						erro.toString();
					}
				}
			}
		}
		System.exit(0);
	}
}
