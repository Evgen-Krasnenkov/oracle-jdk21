package org.kras;

public class TinCan implements AutoCloseable {
    private boolean problem;

    public TinCan(boolean problem) {
        this.problem = problem;
        System.out.println("opened");
    }

    public static void main(String[] args) {
        try (TinCan tc = new TinCan(true)) {
            tc.checkContent(false);
        } catch (ContentException | ClosureException e) {
            System.out.println(e);
        }
    }

    public void checkContent(boolean anyGood) {
        if (!anyGood) {
            throw new ContentException("Not good");
        }
    }

    @Override
    public void close() throws ClosureException {
        if (problem) {
            throw new ClosureException("Problem closing the tin can");
        }
        System.out.println("closed");
    }
}