package clojure;

import clojure.lang.*;

public final class pprint_format_logical_block extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final java.lang.Object const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "clauses");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", ">");
  const__3 = (java.lang.Object)1L;
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "string");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "params");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "colon");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__9 = (java.lang.Object)0L;
  const__10 = (java.lang.Object)2L;
  const__11 = (clojure.lang.Var)RT.var("clojure.pprint", "next-arg");
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "level-exceeded");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__15 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-level*");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "var-get");
  const__18 = (clojure.lang.Var)RT.var("clojure.pprint", "*current-length*");
 }
 public pprint_format_logical_block() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object navigator2, java.lang.Object offsets3) {
  try {
   {
    Object clauses4 = RT.get(params1, Keyword.intern(null, "clauses"));
    int clause_count5 = clojure.lang.RT.count(((java.lang.Object)clauses4));
    Object __r5629;
    if (clojure.lang.Numbers.gt((long)clause_count5, (long)1L)) {
     __r5629 = RT.get(RT.get(((IFn)const__6.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(clauses4)), Keyword.intern(null, "params")), Keyword.intern(null, "string"));
    } else {
     Object __r5630;
     Object __r5631 = RT.get(params1, Keyword.intern(null, "colon"));
     if (__r5631 != null && !(__r5631 == Boolean.FALSE)) {
      __r5630 = "(";
     } else {
      __r5630 = null;
     }
     __r5629 = __r5630;
    }
    Object prefix6 = __r5629;
    Object __r5632;
    if (clojure.lang.Numbers.gt((long)clause_count5, (long)1L)) {
     __r5632 = 1L;
    } else {
     __r5632 = 0L;
    }
    Object body7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)clauses4), (int)RT.intCast((java.lang.Long)__r5632)));
    Object __r5633;
    if (clojure.lang.Numbers.gt((long)clause_count5, (long)2L)) {
     __r5633 = RT.get(RT.get(((IFn)const__6.getRawRoot()).invoke(((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)clauses4), (int)RT.intCast(2L)))), Keyword.intern(null, "params")), Keyword.intern(null, "string"));
    } else {
     Object __r5634;
     Object __r5635 = RT.get(params1, Keyword.intern(null, "colon"));
     if (__r5635 != null && !(__r5635 == Boolean.FALSE)) {
      __r5634 = ")";
     } else {
      __r5634 = null;
     }
     __r5633 = __r5634;
    }
    Object suffix8 = __r5633;
    Object vec__79229 = ((IFn)const__11.getRawRoot()).invoke(navigator2);
    Object arg10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__79229), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object navigator11 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__79229), (int)RT.intCast(1L), ((java.lang.Object)null)));
    Object __r5637 = ((IFn)const__12).invoke();
    if (__r5637 != null && !(__r5637 == Boolean.FALSE)) {
     ((java.io.Writer)const__13.get()).write((java.lang.String)((java.lang.String)"#"));
    } else {
     ((IFn)const__14.getRawRoot()).invoke(RT.map(const__15, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)((IFn)const__17.getRawRoot()).invoke(const__15)))), const__18, const__9));
     ((IFn)new clojure.pprint_format_logical_block_fn__7923(prefix6, params1, suffix8, body7, arg10)).invoke();
    }
    return navigator11;
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
