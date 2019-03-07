package pl.piomin.authorization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.piomin.authorization.domain.Credentials;

/**
 * Created by ahmed on 21.5.18.
 */
public interface CredentialRepository extends JpaRepository<Credentials, Long> {
    Credentials findByName(String name);
}
