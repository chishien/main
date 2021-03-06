package seedu.whatsnext.model.task.exceptions;

import seedu.whatsnext.commons.exceptions.DuplicateDataException;

/**
 * Signals that the operation will result in duplicate BasicTask objects.
 */
public class DuplicateTaskException extends DuplicateDataException {
    public DuplicateTaskException() {
        super("Operation would result in duplicate tasks");
    }
}
