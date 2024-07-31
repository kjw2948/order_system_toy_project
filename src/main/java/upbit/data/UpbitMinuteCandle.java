package upbit.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class UpbitMinuteCandle {
    private String market;

    @JsonProperty("candle_date_time_utc") // 스네이크 케이스 -> 카멜케이스
    private String candleDataTimeUtc;

    @JsonProperty("candle_data_time_kst")
    private String candleDataTimeKst;

    @JsonProperty("opening_price")
    private String openingPrice;

    @JsonProperty("high_price")
    private String highPrice;

    @JsonProperty("low_price")
    private String lowPrice;

    @JsonProperty("trade_price")
    private String tradePrice;

    private String timestamp;

    @JsonProperty("candle_acc_trade_price")
    private String candleAccTradePrice;

    @JsonProperty("candle_acc_trade_volume")
    private String candleAccTradeVolume;

    private String unit;
}
