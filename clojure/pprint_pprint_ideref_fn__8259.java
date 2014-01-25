package clojure;

import clojure.lang.*;

public final class pprint_pprint_ideref_fn__8259 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Keyword const__13;
 public static final clojure.lang.Var const__14;
 public static final java.lang.Object const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "start-block");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-indent");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "block");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__6 = (java.lang.Object)2L;
  const__7 = (clojure.lang.Var)RT.var("clojure.pprint", "pprint-newline");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "linear");
  const__9 = (clojure.lang.Var)RT.var("clojure.pprint", "write-out");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "future?");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "future-done?");
  const__13 = (clojure.lang.Keyword)Keyword.intern(null, "pending");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__15 = (java.lang.Object)clojure.lang.IPending.class;
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "not-delivered");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__19 = (clojure.lang.Var)RT.var("clojure.pprint", "end-block");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object o1;
 Object prefix3;
 public pprint_pprint_ideref_fn__8259(final Object o1, final Object prefix3) {
  super();
  this.o1 = o1;
  this.prefix3 = prefix3;
 }
 public java.lang.Object invoke() {
  try {
   ((IFn)const__0).invoke(const__1.get(), this.prefix3, null, ">");
   ((IFn)const__2.getRawRoot()).invoke(const__3, Numbers.num(clojure.lang.Numbers.minus((long)clojure.lang.Numbers.minus((long)clojure.lang.RT.count(((java.lang.Object)this.prefix3)), (long)2L))));
   ((IFn)const__7.getRawRoot()).invoke(const__8);
   Object __r5946;
   Object __r5947 = null;
   {
    Object and__3966__auto__3 = ((IFn)const__10.getRawRoot()).invoke(this.o1);
    Object __r5948;
    Object __r5949 = and__3966__auto__3;
    if (__r5949 != null && !(__r5949 == Boolean.FALSE)) {
     __r5948 = ((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(this.o1));
    } else {
     __r5948 = and__3966__auto__3;
    }
    __r5947 = __r5948;
   }
   Object __r5950 = __r5947;
   if (__r5950 != null && !(__r5950 == Boolean.FALSE)) {
    __r5946 = const__13;
   } else {
    Object __r5951;
    Object __r5952 = null;
    {
     boolean and__3966__auto__4 = (this.o1 instanceof clojure.lang.IPending);
     Object __r5953;
     if (and__3966__auto__4) {
      __r5953 = ((IFn)const__11.getRawRoot()).invoke(Reflector.invokeNoArgInstanceMember(this.o1, "isRealized"));
     } else {
      __r5953 = (and__3966__auto__4 ? Boolean.TRUE : Boolean.FALSE);
     }
     __r5952 = __r5953;
    }
    Object __r5954 = __r5952;
    if (__r5954 != null && !(__r5954 == Boolean.FALSE)) {
     __r5951 = const__16;
    } else {
     Object __r5955;
     Object __r5956 = const__17;
     if (__r5956 != null && !(__r5956 == Boolean.FALSE)) {
      __r5955 = ((IFn)const__18.getRawRoot()).invoke(this.o1);
     } else {
      __r5955 = null;
     }
     __r5951 = __r5955;
    }
    __r5946 = __r5951;
   }
   ((IFn)const__9.getRawRoot()).invoke(__r5946);
   return ((IFn)const__19).invoke(const__1.get());
  } finally {
   ((IFn)const__20.getRawRoot()).invoke();
  }
 }
}
