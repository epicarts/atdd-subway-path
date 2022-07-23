package nextstep.subway.domain;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Distance {
    @Column
    int distance;

    public Distance(int distance) {
        this.distance = distance;
    }

    public boolean isMoreLongerThan(Distance target) {
        return this.distance >= target.distance;
    }

    public int getValue() {
        return this.distance;
    }

    public int minus(Distance target) {
        return this.distance - target.distance;
    }

    public int plus(Distance target) {
        return this.distance + target.distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Distance)) {
            return false;
        }
        Distance distance1 = (Distance) o;
        return distance == distance1.distance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(distance);
    }
}
