package lic.swifter.box.api.model;

/**
 * Created by lic on 16-8-1.
 */
public class Result<T> {

    public int resultcode;

    public int error_code;

    public String reason;

    public T result;
}
