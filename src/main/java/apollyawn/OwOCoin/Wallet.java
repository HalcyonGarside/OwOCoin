package apollyawn.OwOCoin;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.TextChannel;

import java.util.HashMap;

public class Wallet {

    int numCoins;
    HashMap<String, Integer> channelLevels;

    Wallet(JDA jda)
    {
        numCoins = 0;

        channelLevels = new HashMap<String, Integer>();
        for(TextChannel channel : jda.getTextChannels())
        {
            channelLevels.put(channel.getName(), 0);
        }
    }

}
