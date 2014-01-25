package clojure;

import clojure.lang.*;

public final class test_file_and_line extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.IPersistentMap const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__5 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "line"), null, Keyword.intern(null, "file"), null);
 }
 public test_file_and_line() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object exception1, java.lang.Object depth2) {
  {
   Object stacktrace3 = ((java.lang.StackTraceElement[])((java.lang.Throwable)exception1).getStackTrace());
   if (clojure.lang.Numbers.lt(((java.lang.Object)depth2), (long)clojure.lang.RT.count(((java.lang.Object)stacktrace3)))) {
    {
     Object s4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)stacktrace3), (int)RT.intCast(depth2)));
     return RT.mapUniqueKeys(const__3, ((java.lang.String)((java.lang.StackTraceElement)s4).getFileName()), const__4, Integer.valueOf(((java.lang.StackTraceElement)s4).getLineNumber()));
    }
   } else {
    return const__5;
   }
  }
 }
}
