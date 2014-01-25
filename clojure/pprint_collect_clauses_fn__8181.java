package clojure;

import clojure.lang.*;

public final class pprint_collect_clauses_fn__8181 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Keyword const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Keyword const__18;
 public static final clojure.lang.Keyword const__19;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (java.lang.Object)2L;
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "process-clause");
  const__5 = (java.lang.Object)3L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "right-bracket");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "merge-with");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "clauses");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "right-params");
  const__13 = (clojure.lang.Var)RT.var("clojure.pprint", "format-error");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "first");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "else-params");
  const__18 = (clojure.lang.Keyword)Keyword.intern(null, "separator");
  const__19 = (clojure.lang.Keyword)Keyword.intern(null, "allows-separator");
 }
 Object bracket_info1;
 Object offset2;
 public pprint_collect_clauses_fn__8181(final Object bracket_info1, final Object offset2) {
  super();
  this.bracket_info1 = bracket_info1;
  this.offset2 = offset2;
 }
 public java.lang.Object invoke(java.lang.Object p__81801) {
  {
   Object vec__81822 = p__81801;
   Object clause_map3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81822), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object saw_else4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81822), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object remainder5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81822), (int)RT.intCast(2L), ((java.lang.Object)null)));
   {
    Object vec__81836 = ((IFn)const__4.getRawRoot()).invoke(this.bracket_info1, this.offset2, remainder5);
    Object clause7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81836), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object vec__81848 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81836), (int)RT.intCast(1L), ((java.lang.Object)null)));
    Object type9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81848), (int)RT.intCast(0L), ((java.lang.Object)null)));
    Object right_params10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81848), (int)RT.intCast(1L), ((java.lang.Object)null)));
    Object else_params11 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81848), (int)RT.intCast(2L), ((java.lang.Object)null)));
    Object remainder12 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81848), (int)RT.intCast(3L), ((java.lang.Object)null)));
    if (clojure.lang.Util.equiv(((java.lang.Object)type9), ((java.lang.Object)const__7))) {
     Object __r5836;
     Object __r5837 = saw_else4;
     if (__r5837 != null && !(__r5837 == Boolean.FALSE)) {
      __r5836 = const__10;
     } else {
      __r5836 = const__11;
     }
     return RT.vector(null, RT.vector(((IFn)const__8.getRawRoot()).invoke(const__9.getRawRoot(), clause_map3, RT.map(__r5836, RT.vector(clause7), const__12, right_params10)), remainder12));
    } else {
     if (clojure.lang.Util.equiv(((java.lang.Object)type9), ((java.lang.Object)const__10))) {
      Object __r5840 = RT.get(clause_map3, Keyword.intern(null, "else"));
      if (__r5840 != null && !(__r5840 == Boolean.FALSE)) {
       return ((IFn)const__13.getRawRoot()).invoke("Two else clauses (\"~:;\") inside bracket construction.", this.offset2);
      } else {
       Object __r5842 = ((IFn)const__14.getRawRoot()).invoke(RT.get(this.bracket_info1, Keyword.intern(null, "else")));
       if (__r5842 != null && !(__r5842 == Boolean.FALSE)) {
        return ((IFn)const__13.getRawRoot()).invoke("An else clause (\"~:;\") is in a bracket type that doesn't support it.", this.offset2);
       } else {
        Object __r5844 = null;
        {
         boolean and__3966__auto__13 = clojure.lang.Util.equiv(((java.lang.Object)const__15), ((java.lang.Object)RT.get(this.bracket_info1, Keyword.intern(null, "else"))));
         Object __r5845;
         if (and__3966__auto__13) {
          __r5845 = ((IFn)const__16.getRawRoot()).invoke(RT.get(clause_map3, Keyword.intern(null, "clauses")));
         } else {
          __r5845 = (and__3966__auto__13 ? Boolean.TRUE : Boolean.FALSE);
         }
         __r5844 = __r5845;
        }
        Object __r5846 = __r5844;
        if (__r5846 != null && !(__r5846 == Boolean.FALSE)) {
         return ((IFn)const__13.getRawRoot()).invoke("The else clause (\"~:;\") is only allowed in the first position for this directive.", this.offset2);
        } else {
         Object __r5848 = Boolean.TRUE;
         if (__r5848 != null && !(__r5848 == Boolean.FALSE)) {
          if (clojure.lang.Util.equiv(((java.lang.Object)const__15), ((java.lang.Object)RT.get(this.bracket_info1, Keyword.intern(null, "else"))))) {
           return RT.vector(Boolean.TRUE, RT.vector(((IFn)const__8.getRawRoot()).invoke(const__9.getRawRoot(), clause_map3, RT.mapUniqueKeys(const__10, RT.vector(clause7), const__17, else_params11)), Boolean.FALSE, remainder12));
          } else {
           return RT.vector(Boolean.TRUE, RT.vector(((IFn)const__8.getRawRoot()).invoke(const__9.getRawRoot(), clause_map3, RT.mapUniqueKeys(const__11, RT.vector(clause7))), Boolean.TRUE, remainder12));
          }
         } else {
          return null;
         }
        }
       }
      }
     } else {
      if (clojure.lang.Util.equiv(((java.lang.Object)type9), ((java.lang.Object)const__18))) {
       Object __r5852 = saw_else4;
       if (__r5852 != null && !(__r5852 == Boolean.FALSE)) {
        return ((IFn)const__13.getRawRoot()).invoke("A plain clause (with \"~;\") follows an else clause (\"~:;\") inside bracket construction.", this.offset2);
       } else {
        Object __r5854 = ((IFn)const__14.getRawRoot()).invoke(RT.get(this.bracket_info1, Keyword.intern(null, "allows-separator")));
        if (__r5854 != null && !(__r5854 == Boolean.FALSE)) {
         return ((IFn)const__13.getRawRoot()).invoke("A separator (\"~;\") is in a bracket type that doesn't support it.", this.offset2);
        } else {
         Object __r5856 = Boolean.TRUE;
         if (__r5856 != null && !(__r5856 == Boolean.FALSE)) {
          return RT.vector(Boolean.TRUE, RT.vector(((IFn)const__8.getRawRoot()).invoke(const__9.getRawRoot(), clause_map3, RT.mapUniqueKeys(const__11, RT.vector(clause7))), Boolean.FALSE, remainder12));
         } else {
          return null;
         }
        }
       }
      } else {
       return null;
      }
     }
    }
   }
  }
 }
}
