package kg12;
/**
 * 学生を表すクラスです。
 *
 * このクラスは学籍番号 studentId と得点 score をフィールドとして持ちます。
 */
public class Student {

    private String studentId;
    private int score;

    public Student(String studentId, int score) {
        this.studentId = studentId;
        this.score = score;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getScore() {
        return score;
    }

    /**
     * この学生が合格か不合格かを判断します。
     *
     * @return このインスタンスの score が 60 以上の場合 true を返します。　その他の場合は false を返します。
     */
    public boolean isPass() {
        if (score >= 60) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * この学生の点数を調整します。引数の値がこのインスタンスのscoreに加算されます。引数に負の値を入れることもできます。
     *
     * @param diff scoreに加算する数値
     */
    public void adjust(int diff) {
        this.score += diff;
    }

}
