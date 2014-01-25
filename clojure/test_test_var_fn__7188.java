package clojure;

import clojure.lang.*;

public final class test_test_var_fn__7188 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Keyword const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test", "do-report");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "type");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "error");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "message");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "expected");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "actual");
 }
 Object t3;
 public test_test_var_fn__7188(final Object t3) {
  super();
  this.t3 = t3;
 }
 public java.lang.Object invoke() {
  try {
   return ((IFn)this.t3).invoke();
  }
  catch (Throwable ex___) {
   if (ex___ instanceof java.lang.Throwable) {
    java.lang.Throwable e3 = (java.lang.Throwable) ex___;
    return ((IFn)const__0.getRawRoot()).invoke(RT.mapUniqueKeys(const__1, const__2, const__3, "Uncaught exception, not in assertion.", const__4, null, const__5, e3));
   }
   else {
    throw Util.sneakyThrow(ex___);
   }
  }
 }
}
