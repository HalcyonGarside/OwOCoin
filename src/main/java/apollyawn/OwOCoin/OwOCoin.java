package apollyawn.OwOCoin;


import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.User;

import javax.security.auth.login.LoginException;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class OwOCoin {

    public static JDA jda;
    public static Map<String, Wallet> userMap;
    public static String prefix = "uwo";

    public static void main(String[] args) throws LoginException
    {
        jda = JDABuilder.createDefault("ODU4ODExMDQ5MzUyNjI2MTg2.YNjkHg.H6fsDtq47JieoJpLJ_XSEqfxkr8").build();
        jda.getPresence().setStatus(OnlineStatus.IDLE);

        userMap = new HashMap<String, Wallet>();
        for(User u : jda.getUsers())
        {
            userMap.put(u.getAsTag(), new Wallet(jda));
        }

        jda.getPresence().setActivity(Activity.playing("with your feelings"));

        jda.addEventListener(new Commands());
    }

}
