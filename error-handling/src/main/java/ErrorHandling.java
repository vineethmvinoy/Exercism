import java.util.Optional;
import java.io.IOException;
class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() {
        throw new IllegalArgumentException();
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws CustomCheckedException{
      throw new CustomCheckedException();
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException{
        throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingAnyUncheckedException() throws CustomUncheckedException {
       throw new CustomUncheckedException();
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message)throws CustomUncheckedException {
        throw new CustomUncheckedException(message);
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException{
        
            throw new CustomCheckedException();
        
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message)throws CustomCheckedException {
       throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingCustomUncheckedException()throws CustomUncheckedException {
        throw new CustomUncheckedException();
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message)throws CustomUncheckedException {
        throw new CustomUncheckedException(message);
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        try {
            return Optional.of(Integer.parseInt(integer));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}


