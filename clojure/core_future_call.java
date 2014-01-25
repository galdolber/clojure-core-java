package clojure;

import clojure.lang.*;

public final class core_future_call extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Keyword const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.IPersistentMap const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "binding-conveyor-fn");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__2 = (java.lang.Object)6380;
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__4 = (java.lang.Object)5;
  const__5 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "column"), 5, Keyword.intern(null, "line"), 6380);
 }
 public core_future_call() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  {
   Object f2 = ((IFn)const__0.getRawRoot()).invoke(f1);
   Object fut3 = ((java.util.concurrent.Future)((clojure.lang.ExecutorService)((clojure.lang.ExecutorService)clojure.lang.Agent.soloExecutor)).submit((java.util.concurrent.Callable)((java.util.concurrent.Callable)f2)));
   return ((IObj)new clojure.core_future_call_reify__6326(fut3)).withMeta(const__5);
  }
 }
}
