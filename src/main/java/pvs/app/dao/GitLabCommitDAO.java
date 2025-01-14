package pvs.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pvs.app.entity.GitlabCommit;

import java.util.List;

@Repository
public interface GitLabCommitDAO extends CrudRepository<GitlabCommit, Long> {
    List<GitlabCommit> findByRepoOwnerAndRepoName(String repoOwner, String repoName);

    GitlabCommit findFirstByRepoOwnerAndRepoNameOrderByCommittedDateDesc(String repoOwner, String repoName);
}
