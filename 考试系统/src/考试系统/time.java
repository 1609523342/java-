package ����ϵͳ;

public class time {
	 static int endtime = 90*60;
	 public static void countdown(){
		 while(endtime>0){
			 endtime--;
			 try {
				Thread.sleep(1000);
				int hour = endtime/60/60%60;
				int minute = endtime/60%60;
				int second = endtime%60;
				System.out.println("��ʣ"+hour+"Сʱ"+minute+"����"+second+"��");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
	 }
}

