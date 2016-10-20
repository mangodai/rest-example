package se.ivankrizsan.restexample.services;

import org.springframework.stereotype.Service;
import se.ivankrizsan.restexample.domain.Drawing;
import se.ivankrizsan.restexample.repositories.DrawingRepository;

/**
 * Service exposing operations on drawings.
 *
 * @author Ivan Krizsan
 */
@Service
public class DrawingService extends AbstractServiceBase<Drawing> {

    /**
     * Creates a mService instance that will use the supplied repository for entity persistence.
     *
     * @param inRepository Drawing repository.
     */
    public DrawingService(final DrawingRepository inRepository) {
        super(inRepository);
    }
}
