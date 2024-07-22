import java.util.ArrayList;
import java.util.Arrays;
public class Leetcode2418 {
    public static String[] sortPeople(String[] names, int[] heights) {
        ArrayList<String> mylist = new ArrayList<>();
        String[] result = new String[names.length];
        for (int i = 0; i < heights.length; i++) {
            mylist.add(names[i] + ":" + heights[i]);
        }
        Integer[] sortedHeights = Arrays.stream(heights).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedHeights, (a, b) -> b - a);

        int j = 0;

        for (int i = 0; i < sortedHeights.length; i++) {
            for (String str : mylist) {
                if (str.endsWith(":" + sortedHeights[i])) {
                    result[j] = str.split(":")[0]; 
                    break; 
                }
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        String []names = {"FQKWPldlyvb","Akwkxtipdbgbnvr","WISDUMUUXXRAjw","JDHPNANCRz","EZSSfllsxeuoqctonn","BDVTQIZTMTEUNUR","AOTLMWZECGdu","Ree","CIZOHTVXXSekedl","NKYXVWIMKFPXEWJALVFL","KYBZAYihphrayad","SPRSqjuivruvglqt","QWHPPQtubsbim","Yiut","RFVCzatqdlijtazmlhp","GJSRFPTIZUYLdrewp","OLMNJCVDD","MPTCAWHfplgfmqv","DHORWNXLYLpxaacvp","XTCGhb","YTNJNESBHPythkbhsj","QROHUGPKWWXVSVKJOHK","AFJLZYWTUWGOANHVj","DQLIRCWUWDfnomjmbfid","MNQGXJIIejvcl","Qxqenf","JSTSwqgtdw","DNQlum","NUgbjfszewxi","Nc","ADNVJUPDCopgle","IDBWynpsz","Albbc","Uabjejkgixscmp","NWYUDNKCASEHOWSUspgk","RFYVHVVGzonviedaql","BWSv","Hrb","JXSolefetxfgwtztcr","AZJEPABTORLRUDTQyiby","MCAZWMbsjpe","YTVPNYMIJUES","DCXEZGughfqv","ODTJ","WJSsz","Bm","VDPWDqrcaxl","CBJKZTRNTZNWNAnavzf","FRXAWJHkipvamb","VNgxegnatqioyk","PSKCUESNWOKSRfh","Gpvoumd","Eerguybuwscseawasr","QWW","YBt","QMolllgiomerph","EXVWtwifcnwfuvehwup","TLRDPWECq","NHZYYKIzxak","Hpoe","GNa","KIfz"};
        int []heights = {29894,40456,65460,49266,74627,31958,49539,74985,33879,43253,28084,38407,2536,49170,31206,85317,51576,35636,305,74904,68443,24265,88473,28470,24928,58594,28439,26762,9355,74752,20253,20979,90766,83956,21375,985,61468,54570,15894,9540,86547,19422,436,29866,28355,55061,27019,60415,3475,56692,1161,34565,75175,75657,66588,50840,20407,51866,5796,56102,19386,2357};
        String []ans = sortPeople(names, heights);
        for (String string : ans) {
            System.out.print(string+" ");
        }
    }
}
