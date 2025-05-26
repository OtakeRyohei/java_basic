package jp.ssie.ocjp.repetition;

public class Practice0416_15 {
	public static void main(String[] args) {
		int startDay = 4; // 木曜日（0=日, 1=月, ..., 6=土）→ 木曜=4
        int daysInMonth = 30;

        System.out.println("日 月 火 水 木 金 土");

        // 最初の空白（日〜水）
        for (int i = 0; i < startDay; i++) {
            System.out.print("   "); // 3文字の空白
        }

        // 日付の出力
        for (int day = 1; day <= daysInMonth; day++) {
            // 日付を2桁で表示（1桁のときは前に空白）
            System.out.printf("%2d ", day);

            // 土曜日で改行（0〜6の7つで1週間）
            if ((startDay + day - 1) % 7 == 6) {
                System.out.println();
            }
        }
	}

}
