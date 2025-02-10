package models.setdata;


import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;


import java.util.ArrayList;

@Data
public class AbrirLoombokData {
     String url; // Debe ser 'private' para que Lombok genere el getter

    public String getUrl() {
        return url;
    }

    public static List<AbrirLoombokData> setData(DataTable dataTable) {
        List<AbrirLoombokData> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, AbrirLoombokData.class));
        }
        return dates;
    }

}

