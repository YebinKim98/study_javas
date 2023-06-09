import java.util.ArrayList;
import java.util.HashMap;

public class MedicalCheckupWithoutDB {
    public static void main(String[] args) {
        try {
            //HashMap 활용해 입력과 출력하기
            ArrayList<HashMap> MadicalList = new ArrayList<HashMap>();
            HashMap<String, String> MadicalSpec = new HashMap<String, String>();
            MadicalSpec.put("이름","홍길동");
            MadicalSpec.put("성별", "남");
            MadicalSpec.put("나이", "30");
            MadicalSpec.put("키 (cm)", "75");
            MadicalSpec.put("체중 (kg)", "175");
            MadicalSpec.put("혈압 (mmHg)", "120/80");
            MadicalSpec.put("혈당 (mg/dL)", "90");
            MadicalSpec.put("검진결과", "비정상");
            MadicalSpec.put("재검진 항목", "폐암,갑상선 질환");
            MadicalSpec.put("유지방안", "");
            MadicalList.add(MadicalSpec);
            
            MadicalSpec = new HashMap<String, String>();
            MadicalSpec.put("이름","김영희");
            MadicalSpec.put("성별", "여");
            MadicalSpec.put("나이", "25");
            MadicalSpec.put("키 (cm)", "160");
            MadicalSpec.put("체중 (kg)", "55");
            MadicalSpec.put("혈압 (mmHg)", "110/70");
            MadicalSpec.put("혈당 (mg/dL)", "85");
            MadicalSpec.put("검진결과", "비정상");
            MadicalSpec.put("재검진 항목", "간암, 뇌졸중");
            MadicalSpec.put("유지방안", "");
            MadicalList.add(MadicalSpec);

            MadicalSpec = new HashMap<String, String>();
            MadicalSpec.put("이름","박철수");
            MadicalSpec.put("성별", "남");
            MadicalSpec.put("나이", "45");
            MadicalSpec.put("키 (cm)", "180");
            MadicalSpec.put("체중 (kg)", "85");
            MadicalSpec.put("혈압 (mmHg)", "130/85");
            MadicalSpec.put("혈당 (mg/dL)", "100");
            MadicalSpec.put("검진결과", "정상");
            MadicalSpec.put("재검진 항목", "심장질환");
            MadicalSpec.put("유지방안", "식습관 개선, 운동계획");
            MadicalList.add(MadicalSpec);

            MadicalSpec = new HashMap<String, String>();
            MadicalSpec.put("이름","이지은");
            MadicalSpec.put("성별", "여");
            MadicalSpec.put("나이", "35");
            MadicalSpec.put("키 (cm)", "165");
            MadicalSpec.put("체중 (kg)", "60");
            MadicalSpec.put("혈압 (mmHg)", "115/75");
            MadicalSpec.put("혈당 (mg/dL)", "95");
            MadicalSpec.put("검진결과", "비정상");
            MadicalSpec.put("재검진 항목", "간암, 알츠하이머병");
            MadicalSpec.put("유지방안", "");
            MadicalList.add(MadicalSpec);

            MadicalSpec = new HashMap<String, String>();
            MadicalSpec.put("이름","최민호");
            MadicalSpec.put("성별", "남");
            MadicalSpec.put("나이", "28");
            MadicalSpec.put("키 (cm)", "170");
            MadicalSpec.put("체중 (kg)", "70");
            MadicalSpec.put("혈압 (mmHg)", "125/80");
            MadicalSpec.put("혈당 (mg/dL)", "92");
            MadicalSpec.put("검진결과", "정상");
            MadicalSpec.put("재검진 항목", "간암");
            MadicalSpec.put("유지방안", "");
            MadicalList.add(MadicalSpec);

            for(HashMap<String, String> medical :MadicalList ){
                System.out.println( medical.get("이름") +" "+ medical.get("성별") +" "+ medical.get("나이")+" "+ medical.get("키 (cm)") +" " + medical.get("체중 (kg)") +" "+ medical.get("혈압 (mmHg)") +" "+ medical.get("혈당 (mg/dL)") +" "+ medical.get("검진결과") +" "+ medical.get("재검진 항목") +" "+ medical.get("유지방안")); 
            }
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}