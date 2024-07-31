package upbit.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import upbit.data.MinuteCandle;
import upbit.http.HttpClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UpbitService {

    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    //public List<MinuteCandle> getCandles(int unit, )
}
