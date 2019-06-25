package lotto;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class RankTest {

  @Test
  public void enumTest() {
    Rank rank = Rank.valueOf(5, true);
    Rank rank1 = Rank.valueOf(3, false);
    Rank rank2 = Rank.valueOf(3, false);

    List<Rank> list = new ArrayList<>();
    list.add(rank);
    list.add(rank1);
    list.add(rank2);

    Integer sum = list.stream().map(Rank::getPrize).reduce(0, Integer::sum);
    System.out.println(sum);
    long count = list.stream().filter(a -> a == Rank.FIFTH).count();
    System.out.println(count);
  }

}