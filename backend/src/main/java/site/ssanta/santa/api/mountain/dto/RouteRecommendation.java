package site.ssanta.santa.api.mountain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RouteRecommendation {

    private List<MountainEmbedding> relevantPaths;
    private String recommendation;
}
