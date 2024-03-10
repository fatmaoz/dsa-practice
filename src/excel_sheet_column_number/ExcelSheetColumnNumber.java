package excel_sheet_column_number;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {

        String columnTitle3 = "ZY";
        System.out.println("Example: " + ExcelSheetColumnNumber.titleToNumber(columnTitle3)); // Output: 701
    }

    /**
     * Question-2 Excel Sheet Column Number
     * Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
     * For example:
     * A->1
     * B->2 C->3
     * ... Z->26 AA->27 AB->28 ...
     * Example 1:
     * Input: columnTitle = "A"
     * Example 2:
     * Input: columnTitle = "AB"
     * Example 3:
     * Input: columnTitle = "ZY"
     * Constraints:
     * Output: 1 Output: 28 Output: 701
     * 1 <= columnTitle.length <= 7
     * columnTitle consists only of uppercase English letters. columnTitle is in the range ["A", "FXSHRXW"].
     * Please, test your solution here: https://leetcode.com/problems/excel-sheet-column-number/
     */

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        int length = columnTitle.length();
        for (int i = 0; i < length; i++) {
            int digitValue = columnTitle.charAt(i) - 'A' + 1;
            result = result * 26 + digitValue;

            //ZZY
            //Z -> 26 result = 26
            //Z -> 26 result = 26*26 + 26
            //Y -> 25 result = (26*26+26)*25 + 25
        }
        return result;
    }
    

}
