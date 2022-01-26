package tutorialsninja.demo.tests.dataproviders;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.DataProvider;
import tutorialsninja.demo.dto.Account;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class AccountDataProviders {

    @DataProvider(name = "ResisterAccounts")
    public static Object[][] registerAccounts() throws IOException {
        File file = new File("src/main/resources/data/Accounts.json");
        ObjectMapper objectMapper = new ObjectMapper();

        List<Account> accounts = objectMapper.readValue(file, new TypeReference<List<Account>>() {});

        Object[][] dataAccounts = new Object[accounts.size()][];

        for (int i = 0; i < accounts.size(); i++){
            Object[] account = new Object[]{accounts.get(i)};
            dataAccounts[i] = account;
        }
        return dataAccounts;
    }

    @DataProvider(name = "ResisterInvalidAccounts")
    public static Object[][] registerInvalidAccountTest(){ return new Object[0][];
    }
}
