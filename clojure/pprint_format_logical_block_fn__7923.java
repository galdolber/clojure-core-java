package clojure;

import clojure.lang.*;

public final class pprint_format_logical_block_fn__7923 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "start-block");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "execute-sub-format");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "init-navigator");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "base-args");
  const__5 = (clojure.lang.Var)RT.var("clojure.pprint", "end-block");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object prefix6;
 Object params1;
 Object suffix8;
 Object body7;
 Object arg10;
 public pprint_format_logical_block_fn__7923(final Object prefix6, final Object params1, final Object suffix8, final Object body7, final Object arg10) {
  super();
  this.prefix6 = prefix6;
  this.params1 = params1;
  this.suffix8 = suffix8;
  this.body7 = body7;
  this.arg10 = arg10;
 }
 public java.lang.Object invoke() {
  try {
   ((IFn)const__0).invoke(const__1.get(), this.prefix6, null, this.suffix8);
   ((IFn)const__2.getRawRoot()).invoke(this.body7, ((IFn)const__3.getRawRoot()).invoke(this.arg10), RT.get(this.params1, Keyword.intern(null, "base-args")));
   return ((IFn)const__5).invoke(const__1.get());
  } finally {
   ((IFn)const__6.getRawRoot()).invoke();
  }
 }
}
