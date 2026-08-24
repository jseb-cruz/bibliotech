package dev.sebastiancruz.bibliotech.core.constant;

import java.math.BigDecimal;
import java.time.LocalTime;

public class Constants {
    public final BigDecimal DAILY_FINE_AMOUNT = new BigDecimal(5000);
    public final LocalTime TIME_OF_DAY_TO_VERIFY_FINES = LocalTime.of(00,00);
}
