package pers.paopa.mockito.spy;

import lombok.Data;

public interface IssueRepository {
    Issue save(Issue issue);
}

@Data
class Issue {

    private Long id;
    private String desc;
    private String title;
}


